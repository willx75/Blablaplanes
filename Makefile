
all: Main

Main: 
	curl -XDELETE 'http://localhost:9200/book'
	curl -XDELETE 'http://localhost:9200/flight'
	curl -XDELETE 'http://localhost:9200/pilot'
	curl -XDELETE 'http://localhost:9200/passenger'

	curl -XPUT 'http://localhost:9200/book'
	curl -XPUT 'http://localhost:9200/flight'
	curl -XPUT 'http://localhost:9200/pilot'
	curl -XPUT 'http://localhost:9200/passenger'


