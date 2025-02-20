#LCS

def lcs(x,y,str1,str2):
    dp={}
    def solve(m,n,str1,str2):
        if m==0 or n==0:
            return 0
        elif (n,m) in dp:
            return dp[(n,m)]
        else:
            if str1[m-1]==str2[n-1]:
                c=1+solve(m-1,n-1,str1,str2)
            else:
                c1=solve(m,n-1,str1,str2)
                c2=solve(m-1,n,str1,str2)
                c=max(c1,c2)
            dp[(m,n)]=c
            #print(dp)
            return c
    return solve(x,y,str1,str2)


'''
#Printing LCS
def lcs(x,y,str1,str2):
    dp={}

    def solve(m,n,str1,str2):
        str = ''
        if m==0 or n==0:
            return 0
        elif (n,m) in dp:
            return dp[(n,m)]
        else:
            #print(m,n)
            if str1[m-1]==str2[n-1]:
                #if (n,m) not in dp:
                str=str+str1[m-1]
                    #print(f"m:{m} n:{n}")
                #print('str:',str)
                c=1+solve(m-1,n-1,str1,str2)
            else:
                c1=solve(m,n-1,str1,str2)
                c2=solve(m-1,n,str1,str2)
                c=max(c1,c2)
            dp[(m,n)]=c
            #print(m,n)
            #if (n, m) not in dp:
            print(str[::-1],end='')
            return c
    #print(dp)
    return solve(x,y,str1,str2)
    #print(dp)

'''

A,B=6,6

#str1='ABCDGH'
#str2='AEDFHR'
X='fghijkl'
Y='abcdef'
print('\n',lcs(7,6,X,Y))
#lcs(A,B,str1,str2,{})


'''
a=[1,2,3,4,1]
b=[3,4,1,2,1,3]
print(lcs(5,6,a,b))
'''