package buildinfo

import grails.transaction.Transactional
import grails.util.Metadata

@Transactional
class DemoService {

    String testMetadata() {
        Metadata.current.getProperty('my.var')
    }
}
