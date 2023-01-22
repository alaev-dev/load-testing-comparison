package test.webflux.bisiness.util

private const val TIME_DURATION = 2000L

class SlowApi : ThirdPartyApi {
    override fun getAdditionInfo(): String {
        Thread.sleep(TIME_DURATION)
        return "addition info"
    }
}
