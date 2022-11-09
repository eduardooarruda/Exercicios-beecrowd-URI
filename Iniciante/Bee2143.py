T = int(input())

while T != 0:
    
    for i in range(T):
        N = int(input())
        if N%2 != 0:
            print(N*2-1)
        else:
            print(N*2-2)

    T = int(input())