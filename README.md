# DataStructures-and-Algorithm-In-java

Rotten Oranges Problem:

Analysing :
	The goal is to find the rotten oranges in a given matrix represented by 2, fresh oranges represented by 1 and the empty cells are represented by 0.
A rotten orange can only rot fresh oranges on it’s adjacent sides. No rotten oranges can rot through an empty cell. 
The program will also give a time frame on how long it will take for all the adjacent oranges to rot.

Algorithm:
Queue:
1)	Create a queue class with regular queue functionalities like enqueue(to push in rear), dequeue (to remove from front), get Queue size, get Front and the queue should be a circular queue.
 
  

 
Oranges:	
1)	Traverse through the input matrix and find it’s total number of elements. A 3x3 matrix can have a capacity of 9 and store the value as capacity.
 

2)	Keep a counter for fresh oranges because if there are no fresh oranges we cannot rot anything
 

3)	Instantiate the queue with the capacity we stored earlier.
 
4)	Now, loop through the matrix and find all the rotten oranges(2)
 
5)	Enqueue the row index and the column index. Inside the queue Front = row and Front+1 = column


6)	In the same loop Check if we have any fresh oranges and if yes incerementthe fresh orange counter by 1.
7)	if (grid[i][j] == 1) {
    freshOranges++;
}

8)	Also we need to check if there are any fresh oranges to rot. We do that outside the loop. If no fresh oranges left break the loop.

 

9)	Now, to keep track of the time elapsed while rotting all oranges we declare a timer variable.
 

10)	Iterate over the queue while the queue is not empty
11)	Whilst iterating store the size(total number of available elements) of the queue
 

12)	Now we traverse through the size of the queue and in every iteration we store the front element of the queue as x which represents the row index. Dequeue it and do it again and store it as y as the column index and dequeue it again.
 

13)	Giving boundaries for the program(rows):
If x is the index of the rows x cannot be greater than the length of the row. 
Find if our adjacent element x+1 is 1(fresh orange) then we rot the orange and decrease the fresh orange count. Same with x-1 
 

14)	Giving boundaries for the program(column):
If 	x is the index of the rows x cannot be greater than the length of the row. 
15)	Find if our adjacent element x+1 is 1(fresh orange) then we rot the orange and decrease the fresh orange count. Same with x-1
 

16)	Increment the timer after each traversal
17)	Return time taken .
 


Main:
1)	The main method contains a dummy set of 2 dimensional array.
2)	A class of Oranges is instantiated to use it’s rot function aka index in my program.
3)	The dummy array is passed by using an object of the Orange class which calls the index method.
