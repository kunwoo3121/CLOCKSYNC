# CLOCKSYNC

https://algospot.com/judge/problem/read/CLOCKSYNC

# 구현 방법

스위치를 누르는 모든 경우의 수를 고려하여 시계들이 12시로 맞추어지는 경우가 있는지 체크하고 그 중 가장 적게 누른 경우를 출력한다.
 
  i)  스위치를 한 번 누를 때마다 3시간씩 바뀌기 때문에 4번 누를 경우 처음 시간으로 돌아간다.   
  
      따라서 스위치를 3번보다 많이 누를 경우 스위치를 누르는 횟수만 늘어나기만 하고 똑같은 경우가 반복이 될 뿐이다.
    
      이를 이용하여 모든 경우를 체크한다.
    
    
