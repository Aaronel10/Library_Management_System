import java.util.Calendar;
import java.util.Date;

public class bookOutOnIssue {
    protected book cur_book;
    protected Date issue_date;
    protected Date return_date;

    public book getCur_book() {
        return cur_book;
    }

    public void setCur_book(book cur_book) {
        this.cur_book = cur_book;
    }

    public Date getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }

    bookOutOnIssue(book cur_book, Date issue_date)
    {
        this.cur_book = cur_book;
        this.issue_date = issue_date;
        // calculate the return date , average rental period is 3 weeks
        int noOfDays = 14;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.issue_date);
        calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
        this.return_date = calendar.getTime();
    }


}
