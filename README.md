# Spring Boot Spock Examples

![](https://spockframework.org/spock/docs/2.0/images/Blocks2Phases.png)

## Specification

```groovy
class MyFirstSpecification extends Specification {
    // fields
    // fixture methods
    // feature methods
    // helper methods
}
```

## Block 

* given
* when
* then
  * with
  * verifyAll
* except
* cleanup
* where

## Documentation

```groovy
given: "open a database connection"
// code goes here

and: "seed the customer table"
// code goes here

and: "seed the product table"
```

```groovy
given: "an empty bank account"
// ...

when: "the account is credited \$10"
// ...

then: "the account's balance is \$10"
// ...
```

## Extensions

* @Timeout
* @Ignore
* @IgnoreRest
* @FailsWith

## Test Cases

* FirstExample

## References

* https://spockframework.org/
* https://github.com/spockframework/spock-example
* https://github.com/trishagee/spock-testing-demo
