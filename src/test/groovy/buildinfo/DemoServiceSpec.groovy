package buildinfo

import grails.test.mixin.TestFor
import grails.util.Metadata
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(DemoService)
class DemoServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:
        service.testMetadata() == '1.2.3.4'
    }
}
