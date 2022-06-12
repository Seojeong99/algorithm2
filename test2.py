testcase = int(input())
for t in range(testcase):
    n=int(input())
    data=[]
    check=[]
    counta=0
    countb=0
    count=0
    data=list(map(int,(input().split())))
    for i in range(len(data)):
        if(data[i]%2==0):
            check.append(0)
            counta=counta+1
        else:
            check.append(1)
            countb=countb+1

    if len(check)==1:
        print('#{} {}'.format(t+1,0))
        print(0)
    elif counta>countb:
        if(counta-countb>1 ):
            print('#{} {}'.format(t+1,-1))
    elif countb>counta:
        if(countb-counta>1):
            print('#{} {}'.format(t+1,-1))

    else:
        def letscheck(array):
            count=0
            for i in range(len(array)-1):
                if (array[i]==array[i+1]):
                    count=count+1
                    for j in range(i+2, len(array)):
                        if(array[j-1]!=array[j]):
                            x=array[j-1]
                            array[j-1]=array[j]
                            array[j]=x

            print('#{} {}'.format(t + 1,count))


        letscheck(check)