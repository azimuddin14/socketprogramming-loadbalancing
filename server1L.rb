require 'socket'

while true

server=TCPServer.open("192.168.222.129", 3500)
loadbalancer=server.accept
puts "Message received: " 
puts loadbalancer.gets
loadbalancer.close
server.close
end

