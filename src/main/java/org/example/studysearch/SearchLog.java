package org.example.studysearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class SearchLog {
    private List<Map<String, String>> searchHistory;
    private Map<String, Integer> searchCount;

    public SearchLog() {
        searchHistory = new ArrayList<Map<String, String>>();
    }
    public void addSearchHistory(Map<String, String> searchHistory) {
        this.searchHistory.add(searchHistory);
    }
    public List<Map<String, String>> getSearchHistory() {
        return searchHistory;
    }
    public void setSearchHistory(List<Map<String, String>> searchHistory) {
        this.searchHistory = searchHistory;
    }
    public Map<String, Integer> getSearchCount() {
        return searchCount;
    }
    public void setSearchCount(Map<String, Integer> searchCount) {
        this.searchCount = searchCount;
    }
}
