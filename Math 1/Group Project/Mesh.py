from copy import copy
from math import sqrt
import numpy as np


class Mesh:

    def __init__(self):
        self._knutepunktPosisjon = []
        self._staver = []  

    def __str__(self):
        return "Antall knutepunkt = " + str(self.antallKnutepunkt()) + "\n" + \
               "Knutepunktposisjoner = " + str(self._knutepunktPosisjon) + "\n" + \
               "Antall staver = " + str(self.antallStaver()) + "\n" + \
               "Staver = " + str(self._staver)          
                       
    # Antall knutepunkt i modellen    
    def antallKnutepunkt(self):
        return len(self._knutepunktPosisjon)
                   
    # Setter posisjonen til et knutepunkt        
    def settKnutepunktPosisjon(self, knutepunktIndex, nyPosisjon):
        self._knutepunktPosisjon[knutepunktIndex] = nyPosisjon
       
    # Legger til knutepunkt
    def leggTilKnutepunkt(self, posisjon):
        self._knutepunktPosisjon.append(posisjon)      

    # finner posisjonen til et knutepunkt
    def knutepunktPosisjon(self, knutepunktIndex):
        return self._knutepunktPosisjon[knutepunktIndex]

    # legger til en liste med flere staver        
    def leggTilFlereStaver(self, listeKnutepunkter):
        self._staver += listeKnutepunkter
       
    # Gir antall staver
    def antallStaver(self):
        return len(self._staver)
       
    # Endrer knutepunktene til en stav    
    def endreKnutepunktTilStav(self, stavIndex, knutepunkt):
        self._stav[stavIndex] = knutepunkt        
       
    # Gir knutepunktet til en stav
    def knutepunktTilStav(self, stavIndex):
        return self._staver[stavIndex]
    
    def getKnutepunkt(self):
        return self._knutepunktPosisjon
   
    # legg til liste med nye knutepunkt        
    def leggTilFlereKnutepunkt(self, posisjon):
        self._knutepunktPosisjon += posisjon
    
           
    # legger til en stav
    def leggTilStav(self, knutepunkter):
        self._staver.append(knutepunkter)
    
    # Gir en liste med de stavene som er koblet til et knutepunkt
    def staverInnTilKnutepunkt(self, knutepunktIndex):
        return self._staver[knutepunktIndex]

class MeshIter:
   
    def __init__(self, mesh):
        self._start = 0
        self._mesh = mesh
        self._stop = self._mesh.antallStaver() - 1
        self._num = 0
       
    def __iter__(self):
        return self
       
    def __next__(self):
        if self._num > self._stop:
            raise StopIteration
        else:
            self._num += 1
            return self._mesh.knutepunktTilStav(self._num-1)
         
# L = stivehtsmatrisa

# B matrise som inneholder koordinatene til alle noder (knutepunkter)
# A matrise som er en liste av staver fra et knutepunkt til et annet. f.eks  [0,1] er en stav som kobler knutepunkt 0 til knutepunkt 1.

def lagStivhetsmatrise(mesh, knutepunktFastX, knutepunktFastY):
    m = mesh.antallKnutepunkt()
    matrise = np.zeros((2*m, 2*m))
    n = 0
    
    C = np.zeros(2)
    # hver rad i A matrisen, (hver stav altså duhdoi)
    for stav in MeshIter(mesh):
        v = np.array(mesh.getKnutepunkt())[stav[1],:]-np.array(mesh.getKnutepunkt())[stav[0],:]
        v = v/np.linalg.norm(v)
        C = np.vstack([C,v])
        # n+=1

    for i in knutepunktFastX:
        
    for i in knutepunktFastY:
        
    return matrise


# def lagStivhetsmatrise(mesh, knutepunktFastX, knutepunktFastY):
#     m = mesh.antallKnutepunkt()
#     stivhetsmatrise = np.zeros((2*m, 2*m))
#     # Total points?
#     n = 0
#     C = np.zeros(2)
#     # hver rad i A matrisen, (hver stav altså duhdoi)
#     for stav in MeshIter(mesh):
#         v = np.array(mesh.getKnutepunkt())[stav[1],:]-np.array(mesh.getKnutepunkt())[stav[0],:]
#         v = v/np.linalg.norm(v)
#         C = np.vstack([C,v])
#         n+=1
    
#     C = np.delete(C,0,0)
#     for i in knutepunktFastX:
#         stivhetsmatrise[i, 0] = 1
#         # mangler
        
#     for j in knutepunktFastY:
#         stivhetsmatrise[0, j] = 1
#         # mangler
        
#     return stivhetsmatrise

# B matrise som inneholder koordinatene til alle noder (knutepunkter)
# A matrise som er en liste av staver fra et knutepunkt til et annet. f.eks  [0,1] er en stav som kobler knutepunkt 0 til knutepunkt 1.

mesh = Mesh()
mesh.leggTilFlereKnutepunkt([[ 0. , 0.], [ 3.,  0.], [ 3.,  4.], [ 6. , 0.], [ 6. , 4.], [ 9.,  0.], [ 9. , 4.], [12.,  0.]])
mesh.leggTilFlereStaver([[0, 1], [0, 2], [1, 2], [1, 3], [2, 3], [2, 4], [3, 4], [3, 5], [3, 6], [4, 6], [5, 6], [5, 7], [6, 7]])
L = lagStivhetsmatrise(mesh, [0], [0,7])
print(L)

import matplotlib.pyplot as plt
import numpy as np

n=1
# m er det dobbelte av (n+1)
m=2*(n+1)

#nulmatrise med 2*m rader og 2 kolonner.
B = np.zeros((2*m,2))

#partall fra 2 til 2*m, med steg på størrelsen 2
jevn = np.arange(2,2*m,2)
#oddetall fra 1 til 2*m, med steg på størrelsen 2
odde = np.arange(1,2*m,2)

# !GJØR IKKE NOE MED ALLER FØRSTE RAD!
# setter hvert odddetallede rad (programmering index så begynner med første rad er 0) sin første kolonne verdi til 3*odde[i]
B[odde,0] = 3*np.arange(1,m+1)
# Gjør i praksis ingenting her...
B[odde,1] = np.zeros(m)
# setter hvert partallede rad (programmering index så begynner med første rad er 0) sin første kolonne verdi til 3*par[i]
B[jevn,0] = 3*np.arange(1,m)
# setter hvert partallede rad (programmering index så begynner med første rad er 0) sin andre kolonne verdi til 4
B[jevn,1] = 4+np.zeros(m-1)


TLeft = np.array([[1,2],[1,3],[2,3]])
TRight = np.array([[1,3],[2,3]])
SDLeft = np.array([[1,3],[1,4],[2,4],[3,4]])
SDRight = np.array([[1,3],[2,3],[2,4],[3,4]])
SFull = np.array([[1,3],[1,4],[2,3],[2,4],[3,4]])


grunn = 1+2*np.arange(n)

# Lager en matrise A, som er satt til TLeft, også legges til
# SDRight, men x og y verdien er lagt til 1
A = TLeft
for i in grunn:
    A = np.concatenate([A,i+SDRight])
    

#Leggert til SDLeft til matrisen A, men hver x og y er lagt til 1,j og i. hva i alle dager
for j in grunn:
    A = np.concatenate([A,1+j+i+SDLeft])
    

# legger til TRight, men legger også til 3, i og j til hver x og y.
# i tillegg trekkes fra 1 fra alle elementene i matrisen...
A = np.concatenate([A,3+i+j+TRight])-1

fig = plt.figure()

fig, ax = plt.subplots()


# k er en vektor/liste med tall.
for k in A:
    ax.plot(np.transpose(B[k,0]),np.transpose(B[k,1]), color='b')
    
# plt.show()

#-----------------------------

# C = np.zeros(2)

# for k in A:
#     v = B[k[1],:]-B[k[0],:]
#     v = v/np.linalg.norm(v)
#     C = np.vstack([C,v])
# C = np.delete(C,0,0)

# L=np.zeros([4*m,4*m])
# for l in np.arange(np.size(A,0)):
#     L[2*A[l,0],l] = C[l,0]
#     L[2*A[l,0]+1,l] = C[l,1]
#     L[2*A[l,1],l] = C[l,0]
#     L[2*A[l,1]+1,l] = C[l,1]
# q = np.size(A,0)    

# L[0,q]=1
# L[1,q+1]=1
# L[4*m-1,q+2]=1




#-----------------------------

# A matrise som er en liste av staver fra et knutepunkt til et annet. f.eks  [0,1] er en stav som kobler knutepunkt 0 til knutepunkt 1.
# B matrise som inneholder koordinatene til alle noder (knutepunkter)
# F er kreftene som blir utøvet, fra punktene som er angitt or whatever...
# F har samme lengde som hver kolonne i L (eller rad?).
F=np.zeros([4*m,1])
F[3,0]=12
F[7,0]=20
F[11,0]=12
# Ax = B (Lu = F)
# strekk = u
print(L)
# print(np.linalg.inv(L))

# strekk = np.linalg.solve(L,F)

# print(strekk)
