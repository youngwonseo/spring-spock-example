import spock.lang.Specification

class MyFirstSpecification extends Specification {

    def "pushing an element on the stack"() {
        given:
        def stack = new Stack()
        def elem = "push me"

        when:
        stack.push(elem)

        then:
        !stack.empty
        stack.size() == 1
        stack.peek() == elem
    }



    def "throw empty stack exception"() {
        given:
        def stack = new Stack()

        when:
        stack.pop()

        then:
        thrown(EmptyStackException)
        stack.empty
    }


    def "HashMap accepts null key"() {
        given:
        def map = new HashMap()

        when:
        map.put(null, "elem")

        then:
        notThrown(NullPointerException)
    }

    def "computing the maximum of two numbers"() {
        expect:
        Math.max(a, b) == c

        where:
        a << [5, 3]
        b << [1, 9]
        c << [5, 9]
    }
}
