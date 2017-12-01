require 'socket'

client=TCPSocket.open("192.168.111.129", 1500)
message=gets.chomp

rhost=client.peeraddr.last
puts "#{rhost}"
client.write(message)
client.close


