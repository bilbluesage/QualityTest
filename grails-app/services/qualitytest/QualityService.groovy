package qualitytest

import grails.gorm.transactions.Transactional
import qualitytest.Quality

class QualityService {

    @Transactional(readOnly = true)
    def listQualities() {
        Quality quality
        quality.list()
    }

    @Transactional
    def updateQualities() {
        // ...
    }

    def deleteQualities() {
        // ...
    }

    def runErrors(int x) {
        try {
            System.out.println("whatever")
        } catch (Exception e) {
            //do nothing
        }
    }
}
