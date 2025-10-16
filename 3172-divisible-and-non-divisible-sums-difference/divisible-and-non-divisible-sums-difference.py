class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        arr1=[]
        arr2=[]
        sum1=0
        sum2=0
        for i in range(n+1):
            if i%m!=0:
                arr1.append(i)
            else:
                arr2.append(i)
        for i in range(len(arr1)):
            sum1+=arr1[i]
        for i in range(len(arr2)):
            sum2+=arr2[i]
        return sum1-sum2