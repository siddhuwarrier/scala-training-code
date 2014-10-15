package scalaexamples.higherorderfunctions

import org.scalatest.{Matchers, FlatSpec}

/**
 * Copyright (c) Cisco systems 2014. All rights reserved.
 * Date: 15/10/2014
 */
class PersonFilterSpec extends FlatSpec with Matchers {
  val perps = List(Person("Jimmy Saville", 95, List(EmailAddress("jimmy@bbc.com"), EmailAddress("perp@operation-yewtree.info"))),
    Person("Ronnie Biggs", 0, List(EmailAddress("ronnie@great_train.robbery"), EmailAddress("robber@hmp_peterhead.com"))))
  val decentFolk = List(Person("Siddhu", 30, List(EmailAddress("siwarrie@cisco.com"), EmailAddress("me@cisco.com"))),
    Person("Admiral Nelson", 45, List(EmailAddress("nelson@trafalgar.org"))))

  val persons = perps ++ decentFolk

  "The Person filter" should "remove all items in a list of persons that do not meet the filter criteria" in {
    pendingUntilFixed {
      def shouldBeInJail(person: Person): Boolean = {
        perps.contains(person)
      }

      new PersonFilter().filterPersons(persons, shouldBeInJail) should equal (perps)
    }

  }
}
