s = input()
max_len = 1
n = 1

for i in range(1,len(s)):
    if s[i]!=s[i-1]:
        if max_len<n:
            max_len = n 
        n=0
    n+=1

if max_len<n:
    max_len = n 

print(max_len)