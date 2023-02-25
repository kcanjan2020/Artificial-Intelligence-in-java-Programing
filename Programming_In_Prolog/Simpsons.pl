# 2. Simpsons Family Tree
parent('homer','bart').
parent('marge','bart').
parent('homer','lisa').
parent('abraham','homer').
parent('mona','homer').
male('bart').
male('homer').
male('abraham').
female('marge').
female('lisa').
female('mona').
father(X,Y):-parent(X,Y),male(X).
mother(X,Y):-parent(X,Y),female(X).
grandfather(X,Y):-parent(Z,Y),parent(X,Z),male(X).
grandmother(X,Y):-parent(Z,Y),parent(X,Z),female(X).


