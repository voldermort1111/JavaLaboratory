package lab10.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Book extends Media implements Comparable {

  private List<String> authors = new ArrayList<String>();

  private String content;
  private List<String> contentTokens;
  private Map<String, Integer> wordFrequency;

  public Book() {

  }

  public Book(String title) {
    super(title);
  }

  public Book(String title, String category){
    super(title, category);
  }

  public Book(String title, String category, float cost){
    super(title, category);
    super.setCost(cost);
  }

  public Book(String title, String category, List<String>authors){
    super(title, category);
    this.authors = authors;
  }

  public Book(String title, String category, List<String>authors, float cost){
    super(title, category);
    this.authors = authors;
    super.setCost(cost);
  }

  public void processContent() {
    contentTokens = Arrays.asList(content.split("\\.|\\s"));
    wordFrequency = new TreeMap();

    Collections.sort(contentTokens);

    String tmp;
    int i = 0;
    int count;
    while (i < contentTokens.size()) {
      tmp = contentTokens.get(i);
      count = 1;

      if (i == contentTokens.size()-1) {
        wordFrequency.put(contentTokens.get(i), 1);
        break;
      }

      while (true) {
        if (contentTokens.get(i).equals(contentTokens.get(i+count))) {
          count++;
        } else break;
      }

      wordFrequency.put(contentTokens.get(i), count);
      i+=count;
    }
  }

  /**
   * @param content the content to set
   */
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * @return the content
   */
  public String getContent() {
    return content;
  }

  /**
   * @return the contentTokens
   */
  public List<String> getContentTokens() {
    return contentTokens;
  }

  /**
   * @return the wordFrequency
   */
  public Map<String, Integer> getWordFrequency() {
    return wordFrequency;
  }
  /**
   * @return the authors
   */
  public List<String> getAuthors() {
    return authors;
  }
  /**
   * @param authors the authors to set
   */
  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  @Override
  public int compareTo(Object o) {
    return this.getTitle().compareTo(((Book)o).getTitle());
  }

  @Override
  public String toString() {
    return 
    "ID           : " + this.getID() + "\n" +
    "Title        : " + this.getTitle() + "\n" +
    "Category     : " + this.getCategory() + "\n" +
    "Cost         : " + this.getCost() + "\n" +
    "Authors      : " + this.getAuthors() + "\n" +
    "ContentTokens: " + this.getContentTokens() + "\n" +
    "WordFrequency: " + this.getWordFrequency() + "\n";
  }
}