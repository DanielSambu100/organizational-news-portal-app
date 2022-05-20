package models;

import java.util.Objects;

public class News {
    private String newsName;
    private String newsType;
    private int datePosted;

    public News(String newsName, String newsType, int datePosted) {
        this.newsName = newsName;
        this.newsType = newsType;
        this.datePosted = datePosted;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public int getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(int datePosted) {
        this.datePosted = datePosted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return datePosted == news.datePosted && Objects.equals(newsName, news.newsName) && Objects.equals(newsType, news.newsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsName, newsType, datePosted);
    }
}
