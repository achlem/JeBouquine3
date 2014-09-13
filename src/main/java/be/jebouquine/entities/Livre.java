package be.jebouquine.entities;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class Livre
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected int idLivre;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected String titre;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Temporal(javax.persistence.TemporalType.DATE) 
	@javax.persistence.Column(nullable = false) 
	protected Date dateApparition;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected double prix;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected int quantiteEnStock;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected String isbn;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected byte[] photoLivre;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected int idLangue;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected int idAuteur;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected int idEditeur;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected int idCategorie;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany(mappedBy = "livre") 
	protected Set<LigneCommande> ligneCommande;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToOne 
	protected Editeur editeur;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany(mappedBy = "livre") 
	protected Set<Auteur> auteur;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany(mappedBy = "livre") 
	protected Set<Categorie> categorie;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	protected Langue langue;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany(mappedBy = "livre") 
	protected Set<Commentaire> commentaire;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id 
	@javax.persistence.Column(nullable = false) 
	protected final Long id = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Livre(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetEditeur(Editeur myEditeur) {
		if (this.editeur != myEditeur) {
			if (myEditeur != null){
				if (this.editeur != myEditeur) {
					Editeur oldediteur = this.editeur;
					this.editeur = myEditeur;
					if (oldediteur != null)
						oldediteur.unsetLivre();
				}
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetLangue(Langue myLangue) {
		if (this.langue != myLangue) {
			if (myLangue != null){
				if (this.langue != myLangue) {
					Langue oldlangue = this.langue;
					this.langue = myLangue;
					if (oldlangue != null)
						oldlangue.removeLivre(this);
				}
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int getIdLivre() {
		return this.idLivre;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private String getTitre() {
		return this.titre;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private Date getDateApparition() {
		return this.dateApparition;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private double getPrix() {
		return this.prix;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int getQuantiteEnStock() {
		return this.quantiteEnStock;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private String getIsbn() {
		return this.isbn;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private byte[] getPhotoLivre() {
		return this.photoLivre;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int getIdLangue() {
		return this.idLangue;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int getIdAuteur() {
		return this.idAuteur;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int getIdEditeur() {
		return this.idEditeur;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int getIdCategorie() {
		return this.idCategorie;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<LigneCommande> getLigneCommande() {
		if(this.ligneCommande == null) {
				this.ligneCommande = new HashSet<LigneCommande>();
		}
		return (Set<LigneCommande>) this.ligneCommande;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Editeur getEditeur() {
		return this.editeur;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Auteur> getAuteur() {
		if(this.auteur == null) {
				this.auteur = new HashSet<Auteur>();
		}
		return (Set<Auteur>) this.auteur;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Categorie> getCategorie() {
		if(this.categorie == null) {
				this.categorie = new HashSet<Categorie>();
		}
		return (Set<Categorie>) this.categorie;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Langue getLangue() {
		return this.langue;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Commentaire> getCommentaire() {
		if(this.commentaire == null) {
				this.commentaire = new HashSet<Commentaire>();
		}
		return (Set<Commentaire>) this.commentaire;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllLigneCommande(Set<LigneCommande> newLigneCommande) {
		if (this.ligneCommande == null) {
			this.ligneCommande = new HashSet<LigneCommande>();
		}
		for (LigneCommande tmp : newLigneCommande)
			tmp.setLivre(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllAuteur(Set<Auteur> newAuteur) {
		if (this.auteur == null) {
			this.auteur = new HashSet<Auteur>();
		}
		for (Auteur tmp : newAuteur)
			tmp.setLivre(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllCategorie(Set<Categorie> newCategorie) {
		if (this.categorie == null) {
			this.categorie = new HashSet<Categorie>();
		}
		for (Categorie tmp : newCategorie)
			tmp.setLivre(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllCommentaire(Set<Commentaire> newCommentaire) {
		if (this.commentaire == null) {
			this.commentaire = new HashSet<Commentaire>();
		}
		for (Commentaire tmp : newCommentaire)
			tmp.setLivre(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllLigneCommande(Set<LigneCommande> newLigneCommande) {
		if(this.ligneCommande == null) {
			return;
		}
		
		this.ligneCommande.removeAll(newLigneCommande);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllAuteur(Set<Auteur> newAuteur) {
		if(this.auteur == null) {
			return;
		}
		
		this.auteur.removeAll(newAuteur);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllCategorie(Set<Categorie> newCategorie) {
		if(this.categorie == null) {
			return;
		}
		
		this.categorie.removeAll(newCategorie);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllCommentaire(Set<Commentaire> newCommentaire) {
		if(this.commentaire == null) {
			return;
		}
		
		this.commentaire.removeAll(newCommentaire);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setIdLivre(int myIdLivre) {
		this.idLivre = myIdLivre;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setTitre(String myTitre) {
		this.titre = myTitre;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setDateApparition(Date myDateApparition) {
		this.dateApparition = myDateApparition;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setPrix(double myPrix) {
		this.prix = myPrix;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setQuantiteEnStock(int myQuantiteEnStock) {
		this.quantiteEnStock = myQuantiteEnStock;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setIsbn(String myIsbn) {
		this.isbn = myIsbn;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setPhotoLivre(byte[] myPhotoLivre) {
		this.photoLivre = myPhotoLivre;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setIdLangue(int myIdLangue) {
		this.idLangue = myIdLangue;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setIdAuteur(int myIdAuteur) {
		this.idAuteur = myIdAuteur;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setIdEditeur(int myIdEditeur) {
		this.idEditeur = myIdEditeur;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setIdCategorie(int myIdCategorie) {
		this.idCategorie = myIdCategorie;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addLigneCommande(LigneCommande newLigneCommande) {
		if(this.ligneCommande == null) {
			this.ligneCommande = new HashSet<LigneCommande>();
		}
		
		if (this.ligneCommande.add(newLigneCommande))
			newLigneCommande.basicSetLivre(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setEditeur(Editeur myEditeur) {
		this.basicSetEditeur(myEditeur);
		myEditeur.basicSetLivre(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAuteur(Auteur newAuteur) {
		if(this.auteur == null) {
			this.auteur = new HashSet<Auteur>();
		}
		
		if (this.auteur.add(newAuteur))
			newAuteur.basicSetLivre(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addCategorie(Categorie newCategorie) {
		if(this.categorie == null) {
			this.categorie = new HashSet<Categorie>();
		}
		
		if (this.categorie.add(newCategorie))
			newCategorie.basicSetLivre(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setLangue(Langue myLangue) {
		this.basicSetLangue(myLangue);
		myLangue.addLivre(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addCommentaire(Commentaire newCommentaire) {
		if(this.commentaire == null) {
			this.commentaire = new HashSet<Commentaire>();
		}
		
		if (this.commentaire.add(newCommentaire))
			newCommentaire.basicSetLivre(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetIdLivre() {
		this.idLivre = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetTitre() {
		this.titre = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetDateApparition() {
		this.dateApparition = new Date();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetPrix() {
		this.prix = 0.0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetQuantiteEnStock() {
		this.quantiteEnStock = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetIsbn() {
		this.isbn = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetPhotoLivre() {
		this.photoLivre = new byte[32];	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetIdLangue() {
		this.idLangue = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetIdAuteur() {
		this.idAuteur = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetIdEditeur() {
		this.idEditeur = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetIdCategorie() {
		this.idCategorie = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeLigneCommande(LigneCommande oldLigneCommande) {
		if(this.ligneCommande == null)
			return;
		
		if (this.ligneCommande.remove(oldLigneCommande))
			oldLigneCommande.unsetLivre();
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetEditeur() {
		if (this.editeur == null)
			return;
		Editeur oldediteur = this.editeur;
		this.editeur = null;
		oldediteur.unsetLivre();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAuteur(Auteur oldAuteur) {
		if(this.auteur == null)
			return;
		
		if (this.auteur.remove(oldAuteur))
			oldAuteur.unsetLivre();
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeCategorie(Categorie oldCategorie) {
		if(this.categorie == null)
			return;
		
		if (this.categorie.remove(oldCategorie))
			oldCategorie.unsetLivre();
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetLangue() {
		if (this.langue == null)
			return;
		Langue oldlangue = this.langue;
		this.langue = null;
		oldlangue.removeLivre(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeCommentaire(Commentaire oldCommentaire) {
		if(this.commentaire == null)
			return;
		
		if (this.commentaire.remove(oldCommentaire))
			oldCommentaire.unsetLivre();
			
	}
	
}

