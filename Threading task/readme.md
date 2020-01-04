Threading task

The goal is a program which will sum up a list of numbers, by having two threads work together.

Input

A text file with numbers, called input.txt, separated by newlines:
1
56
893
32
13

Implementation

The program should read the file. First it should just add them all together in a loop in a single thread, so that you can check the result. Then it must spawn two threads, T1 and T2, which take turns in adding one number at a time, for example.
T1 reads 1 and passes it to T2
T2 reads 56 and adds it to 1 and passes the result (57) to T1
T1 reads 893 and adds it to 57 and passes the result (950) to T2
Etc. etc.

When it is done it should print the (single-threaded) result and the multi-threaded results, one after the other. If you did it right, they will be the same.

Good luck!

by @https://github.com/philipkaare
