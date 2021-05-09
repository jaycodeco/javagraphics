
bin = clean compile run

all: $(bin)


compile:main.java
	javac $^

run:
	java main

clean: main.class graph.class frames.class
	del $^
