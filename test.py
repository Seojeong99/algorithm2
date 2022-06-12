testcase=int(input())
for t in range(testcase):
    n=int(input())
    data=[]
    b=[]
    data=list(input().split())

    def com(arr,r):
        for i in range(len(arr)):
            if r==1:
                yield [arr[i]]
            else:
                for next in com(arr[:i]+arr[i+1:],r-1):
                    yield [arr[i]]+next

    for i in com(data,2):
        b.append(i)
    count=0
    for i in range(len(b)):
        x=int(b[i][0])
        y=int(b[i][1])
        count=count+(x%y)
    print('#{} {}'.format(t+1,count))
