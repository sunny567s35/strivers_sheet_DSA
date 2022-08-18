# Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.
#Examples 1:
#Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
#
#Output: [[1,0,1],[0,0,0],[1,0,1]]
#
#Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
# 
#Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
#
#Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
#
#Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0
from os import *
from sys import *
from collections import *
from math import *

from typing import List

def setZeros(matrix: List[List[int]]) -> None:
	# Write your code here.
    li = []
    for i in range(len(matrix)) :
        for j in range(len(matrix[0])):
            if matrix[i][j] == 0:
                li.append((i,j))
    for i,j in li :    
        for row in range(len(matrix)):
            for col in range(len(matrix[0])):
                    matrix[i][col] =  -1
                    matrix[row][j] =  -1
    for i in range(len(matrix)) :
        for j in range(len(matrix[0])):
            if matrix[i][j] == -1:
                matrix[i][j] = 0

mat  = [[1,1,1],[1,0,1],[1,1,2]]
a = setZeros(mat)
print(mat)