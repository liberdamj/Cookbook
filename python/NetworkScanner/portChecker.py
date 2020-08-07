#Program checks ports to see which are open (from 0 - 1023)

from socket import *
import time
startTime = time.time()

if __name__ == '__main__':
   target = input('Enter host: ')
   target_IP = gethostbyname(target)
   print ('Starting scan on ', target_IP)

   for i in range(0, 1023):
      s = socket(AF_INET, SOCK_STREAM)

      connection = s.connect_ex((target_IP, i))
      if(connection == 0) :
         print ('Port %d: OPEN' % (i,))
      s.close()
print('Time taken:', time.time() - startTime)
