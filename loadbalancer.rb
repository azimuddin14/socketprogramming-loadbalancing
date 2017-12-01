require 'socket'

loadbalancer=TCPServer.open("192.168.111.129", 1500)

while true
client=loadbalancer.accept

rhost=client.peeraddr.last
puts "#{rhost} connect to loadbalancer"

fromclient=client.gets
puts "Message from client: #{fromclient}"

if fromclient=="water"
sockettoserver1=TCPSocket.open("192.168.222.128", 2500)
sockettoserver1.write(fromclient)
sockettoserver1.close

else if fromclient=="fire"
sockettoserver2=TCPSocket.open("192.168.222.129", 3500)
sockettoserver2.write(fromclient)
sockettoserver2.close

else
puts "Error !"

end
end
end

