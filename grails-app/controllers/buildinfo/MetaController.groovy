package buildinfo

import grails.converters.JSON
import grails.util.Metadata

class MetaController {

    def index() {

        render(text: Metadata.current.getProperty('my.var'))

    }
}
