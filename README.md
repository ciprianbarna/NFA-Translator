# NFA-Translator

Intructions: 
Compile it through terminal. \
Then run in adding the file using: 
Java Main < FileName.txt 


Format for input file: \
5 //number os states\
a b //alphabet\
0 //initial state (only one)\
1 2 3 4 //final states\
4 //Number N\
//Transition table:\
1 2\
-1 3\
4 -1\
-1 3\
4 -1\

Example:\
5\
a b\
0\
1 2 3 4\
4\
1 2\
-1 3\
4 -1\
-1 3\
4 -1