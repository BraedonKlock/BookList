package BestSeller;

/*
 * Book object class
 */

public class Book {
		private String title;
		private String author;
		private String ogLanguage;
		private int firstPublished;
		private float salesInMillions;
		private String genre;

		private int index; //Position in the booklist
		
		// Constructor
		public Book(String title, String author, String ogLanguage, int firstPublished, float salesInMillions, String genre, int index) 
		{
			this.title = title;
			this.author = author;
			this.ogLanguage = ogLanguage;
			this.firstPublished = firstPublished;
			this.salesInMillions = salesInMillions;
			this.genre = genre;
			this.index = index;
		}

		public String getTitle() 
		{
			return title;
		}

		public void setTitle(String title) 
		{
			this.title = title;
		}

		public String getAuthor() 
		{
			return author;
		}

		public void setAuthor(String author) 
		{
			this.author = author;
		}

		public String getOgLanguage() 
		{
			return ogLanguage;
		}

		public void setOgLanguage(String ogLanguage) 
		{
			this.ogLanguage = ogLanguage;
		}

		public int getFirstPublished() 
		{
			return firstPublished;
		}

		public void setFirstPublished(int firstPublished) 
		{
			this.firstPublished = firstPublished;
		}

		public float getSalesInMillions() 
		{
			return salesInMillions;
		}

		public void setSalesInMillions(float salesInMillions) 
		{
			this.salesInMillions = salesInMillions;
		}

		public String getGenre() 
		{
			return genre;
		}

		public void setGenre(String genre) 
		{
			this.genre = genre;
		}

		//Returns the information of all the books attributes. Used to print book object
		@Override
		public String toString() {
			return  "Book " + index + ": " + title +
					", Author(s)= " + author +
					", Original language= " + ogLanguage +
					", First Published= " + firstPublished +
					", Approximate sales in millions= " + salesInMillions +
					", Genre= " + genre;
		}
	}