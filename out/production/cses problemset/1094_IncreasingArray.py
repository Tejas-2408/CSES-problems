length = int(input())
arr = list(map(int,input().split()))

i=1
ans = 0

while i<length:
    if arr[i]<arr[i-1]:
        ans+= arr[i-1]-arr[i]
        arr[i] = arr[i-1]
    i+=1

print(ans)