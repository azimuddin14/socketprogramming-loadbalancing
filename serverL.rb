require 'socket'

while true
server=TCPServer.open("192.168.222.128", 2500)
loadbalancer=server.accept
puts "Message received: "
puts loadbalancer.gets
loadbalancer.close
server.close
end
