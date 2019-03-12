# NFA-Translator

Intructions: 
Compile it through terminal. \
Then run in adding the file using: 
Java Main < FileName.txt 


Format for input file: \
5 //number os states\
a b //alphabet (only 2)\
0 //initial state (only one)\
1 2 3 4 //final states\
4 //Number N\
//Transition table:\
1 2\
-1 3\
4 -1\
-1 3\
4 -1\
//From now on input de string on eachline that u want to translate\
abbbaabbb

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
4 -1\
abbbbbbb
baaaaaa
aabb
abbbb
bbbbaa