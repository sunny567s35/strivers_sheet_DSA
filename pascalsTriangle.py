#Problem Statement: Given an integer N, return the first N rows of Pascal’s triangle.
#
#In Pascal’s triangle, each number is the sum of the two numbers directly above it as shown in the figure below:
#
#Example 1:
#
# Input Format: N = 5
# 
# Result:
#     1
#    1 1
#   1 2 1
#  1 3 3 1
# 1 4 6 4 1
# 
# Explanation: There are 5 rows in the output matrix. Each row corresponds to each one of the rows in the image shown above.
# 
def printPascal(n:int):
    # Write your code here.
    # Return a list of lists.
    arr = [[1]*i  for i in range(1,n+1)]
    for row in range(n):
        for col in range(n):
            if row != 0 and col !=0 and col <row:
                arr[row][col] = arr[row-1][col]+arr[row-1][col-1]
    return arr
print(printPascal(5))
 

