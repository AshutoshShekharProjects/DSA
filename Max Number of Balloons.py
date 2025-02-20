from collections import defaultdict

def maxNumberOfBalloons(text: str) -> int:
    counter=defaultdict(int)
    for txt in text:
        if txt in 'balloon':
            counter[txt]+=1

    return min(counter['b'],counter['a'],counter['l']//2,counter['o']//2,counter['n'])

text ="loonbalxballpoon"
print(maxNumberOfBalloons(text))