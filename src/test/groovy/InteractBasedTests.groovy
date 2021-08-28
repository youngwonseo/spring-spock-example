import spock.lang.Specification



class InteractBasedTests extends Specification {
    interface Subscriber {
        void receive(String message)
    }

    class Publisher {
        List<Subscriber> subscribers = []
        int messageCount = 0

        void send(String message) {
            subscribers*.receive(message)
            messageCount++
        }
    }

    def "events are published to all subscribers"() {
        given:
        def subscriber1 = Mock(Subscriber)
        def subscriber2 = Mock(Subscriber)
        def publisher = new Publisher()
        publisher.add(subscriber1)
        publisher.add(subscriber2)

        when:
        publisher.fire("event")

        then:
        1 * subscriber1.receive("event")
        1 * subscriber2.receive("event")
    }

}
