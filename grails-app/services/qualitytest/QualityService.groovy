package qualitytest

import grails.gorm.transactions.Transactional

class QualityService {

    @Transactional(readOnly = true)
    def listQualities() {
        Quality.list()
    }

    @Transactional
    def updateQualities() {
        // ...
    }

    def deleteQualities() {
        // ...
    }
}
