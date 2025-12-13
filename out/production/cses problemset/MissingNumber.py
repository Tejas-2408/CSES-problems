n = int(input())
l = list(map(int,input().split()))

total_sum = ((n*(n+1))//2)
list_sum = sum(l)

print(total_sum-list_sum)