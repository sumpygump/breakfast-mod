# To build the jar file
all:
	./gradlew build

# To run the minecraft client with mods loaded
runClient:
	./gradlew runClient

clean:
	rm -rf .gradle
	rm -rf build
