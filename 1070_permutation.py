n = int(input())

def check(l):
    for i in range(1,len(l)):
        if l[i]-l[i-1]==1:
            return False
    return True

if n==1:
    print(1)

elif n==2 or n==3:
    print("NO SOLUTION")

else:
    l = []
    start=2

    for j in range(n//2):
        l.append(start)
        start+=2
    
    start = 1
    for j in range(n//2,n):
        l.append(start)
        start+=2

    
    if check(l):
        for i in l:
            print(i,end=" ")
    else:
        print("NO SOLUTION")
