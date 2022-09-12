package RottenOranges;/*
 *Author: Sanim Pokhrel
 *//*
 *Author: Sanim Pokhrel
 */

public class Oranges {

// in an array find the rotten ornages i.e 2
//   the rottehn oranges will rott it's neighbouring oranges
//    0 are empty cells



//    Loop through an array and find the number 2
//  push the index of that array in the queue

//    pop the index from the queue and check if the index is not out of bound
//    if it is not out of bound then check if the index is 1
//    if it is 1 then change it to 2 and push the index in the queue
//    if it is 0 then do nothing
//    if it is 2 then do nothing


    static int getCapacity(int [][] arr){

        int rows = 0;
        int column = 0;
        for (int i = 0; i <arr.length ; i++) {
            rows++;
        }
        for (int j = 0; j <arr[0].length ; j++) {
            column ++;
        }
        return (rows*column);
    }

    static int index(int[][] grid){

        int freshOranges = 0;
        int capacity = getCapacity(grid);
        Queue q = new Queue(capacity);

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    q.enqueue(i);
                    q.enqueue(j);
                }
                if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        if (freshOranges == 0) {
//            System.out.println(0);
            return 0;
        }
        int time = 0;
//  Iterating over the queue and popping each front element and storing it as row and second element as column and
        while (!q.isEmpty(q)) {
            int size = q.size;
            for (int i = 0; i < size; i++) {
                int x = q.arr[q.front()];
                q.dequeue();
                int y = q.arr[q.front()];
                q.dequeue();
                if (x + 1 < grid.length && grid[x + 1][y] == 1) {
                    grid[x + 1][y] = 2;
                    q.enqueue(x + 1);
                    q.enqueue(y);
                    freshOranges--;
                }
                if (x - 1 >= 0 && grid[x - 1][y] == 1) {
                    grid[x - 1][y] = 2;
                    q.enqueue(x - 1);
                    q.enqueue(y);
                    freshOranges--;
                }
                if (y + 1 < grid[0].length && grid[x][y + 1] == 1) {
                    grid[x][y + 1] = 2;
                    q.enqueue(x);
                    q.enqueue(y + 1);
                    freshOranges--;
                }
                if (y - 1 >= 0 && grid[x][y - 1] == 1) {
                    grid[x][y - 1] = 2;
                    q.enqueue(x);
                    q.enqueue(y - 1);
                    freshOranges--;
                }
            }
            time++;
        }
//

       return time;
    }



}