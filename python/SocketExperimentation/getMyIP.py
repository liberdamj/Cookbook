# This program will return the IP of whatever local machine is set in the variable below.

localMachine = "gentlegiant"

# Socket Package is imported to get IPv4 Address
import socket

ipv4Address = socket.gethostbyname(localMachine)

print(ipv4Address)
