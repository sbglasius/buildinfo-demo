package buildinfo

import grails.test.mixin.TestFor
import grails.util.Metadata
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(MetaController)
class MetaControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test MetaData"() {
        expect:
        Metadata.current.getProperty('my.var') == '1.2.3.4'
    }
}
