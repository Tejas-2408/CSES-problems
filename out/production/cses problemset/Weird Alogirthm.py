n = int(input())
l = []

while(n!=1):
    l.append(int(n))
    if n%2==0:
        n=n/2
    else:
        n = (n*3) + 1

l.append(int(n))
for i in l:
    print(i,end=" ")