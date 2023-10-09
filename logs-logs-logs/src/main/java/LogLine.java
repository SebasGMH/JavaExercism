public class LogLine {
    private String lvl;
    private String msg;
    private LogLevel loglvl;

    public LogLine(String logLine) {
        int startIndex = logLine.indexOf("[");
        int endIndex = logLine.indexOf("]");
        String lvl_ = logLine.substring(startIndex + 1, endIndex);
        this.lvl = lvl_;
        this.msg = logLine.substring(endIndex+3);

        System.out.println(lvl_);
        
        switch (lvl_){
            case "TRC":
                this.loglvl = LogLevel.TRACE;
                break;
            case "DBG":
                this.loglvl = LogLevel.DEBUG;
                break;
            case "INF":
                this.loglvl = LogLevel.INFO;
                break;
            case "WRN":
                this.loglvl = LogLevel.WARNING;
                break;
            case "ERR":
                this.loglvl = LogLevel.ERROR;
                break;
            case "FTL":
                this.loglvl = LogLevel.FATAL;
                break;
            default:
                this.loglvl = LogLevel.UNKNOWN;

        }
    }

    public LogLevel getLogLevel() {
        return loglvl;
    }

    public String getOutputForShortLog() {
        int simple = loglvl.getSimpleLvl();
        return simple + ":" + msg;
    }
}
