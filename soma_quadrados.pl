:- encoding(utf8).

soma_quadrados([], 0).

soma_quadrados([H|T], R) :-
    soma_quadrados(T, SomaResto),
    Quadrado is H * H,
    R is Quadrado + SomaResto.
