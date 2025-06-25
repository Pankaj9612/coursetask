package application;
import java.util.Scanner;
public class GoogleDrive extends Google {
	
	int photos;
	int file;
	int docs;
	int audio;
	int vedio;
	int bin;
		
	public GoogleDrive() {
		// TODO Auto-generated constructor stub
	}
	
		public GoogleDrive(String ceo, double turnover, String hq) 
		{
			this.ceo = ceo;
			this.turnover = turnover;
			this.hq = hq;
		}
		
		public void add(String type)
		{
			switch(type)
			{
				case "photos":
				case "Photos":{
					photos++;
					System.out.println("Photo added!");
				}break;
				
				case "file":
				case "File":{
					file++;
					System.out.println("file added");
				}break;
				
				case "docs":
				case "Docs":{
					docs++;
					System.out.println("Dosc added");
				}break;
				
				case "audio":
				case "Audio":{
					audio++;
					System.out.println("Audio added");
				}break;
				
				case "vedio":
				case "Vedio":{
					vedio++;
					System.out.println("Vedio added!");
				}break;
				
				default: {
					System.out.println("Invalid Credentials");
				}
			}
			}
			
			public void del(String type)
			{
				switch(type)
				{
					case "photos":
					case "Photos":{
						photos--;
						System.out.println("Photo added!");
						bin++;
					}break;
					
					case "file":
					case "File":{
						file--;
						System.out.println("file added");
						bin++;
					}break;
					
					case "docs":
					case "Docs":{
						docs--;
						System.out.println("Dosc added");
						docs++;
					}break;
					
					case "audio":
					case "Audio":{
						audio--;
						System.out.println("Audio added");
						bin++;
					}break;
					
					case "vedio":
					case "Vedio":{
						vedio--;
						System.out.println("Vedio added!");
						bin++;
					}break;
					
					default: {
						System.out.println("Invalid Credentials");
					}
				}
				}
			public void displayGoogledrive()
			{
				System.out.println(photos);
				System.out.println(file);
				System.out.println(docs);
				System.out.println(audio);
				System.out.println(vedio);
			}
	
	
	
}
