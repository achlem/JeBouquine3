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
public class Commande
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected int idcommande;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Temporal(javax.persistence.TemporalType.DATE) 
	@javax.persistence.Column(nullable = false) 
	protected Date dateCommande;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected int idEtat;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected int idClient;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = false) 
	protected int idLivraisonInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	protected Client client;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	protected EtatCommande etatCommande;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany(mappedBy = "commande") 
	protected Set<LigneCommande> ligneCommande;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	protected LivraisonType livraisonInfo;

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
	public Commande(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetClient(Client myClient) {
		if (this.client != myClient) {
			if (myClient != null){
				if (this.client != myClient) {
					Client oldclient = this.client;
					this.client = myClient;
					if (oldclient != null)
						oldclient.removeCommande(this);
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
	public void basicSetEtatCommande(EtatCommande myEtatCommande) {
		if (this.etatCommande != myEtatCommande) {
			if (myEtatCommande != null){
				if (this.etatCommande != myEtatCommande) {
					EtatCommande oldetatCommande = this.etatCommande;
					this.etatCommande = myEtatCommande;
					if (oldetatCommande != null)
						oldetatCommande.removeCommande(this);
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
	public void basicSetLivraisonInfo(LivraisonType myLivraisonInfo) {
		if (this.livraisonInfo != myLivraisonInfo) {
			if (myLivraisonInfo != null){
				if (this.livraisonInfo != myLivraisonInfo) {
					LivraisonType oldlivraisonInfo = this.livraisonInfo;
					this.livraisonInfo = myLivraisonInfo;
					if (oldlivraisonInfo != null)
						oldlivraisonInfo.removeCommande(this);
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
	private int getIdcommande() {
		return this.idcommande;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private Date getDateCommande() {
		return this.dateCommande;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int getIdEtat() {
		return this.idEtat;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int getIdClient() {
		return this.idClient;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private int getIdLivraisonInfo() {
		return this.idLivraisonInfo;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Client getClient() {
		return this.client;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public EtatCommande getEtatCommande() {
		return this.etatCommande;	
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
	public LivraisonType getLivraisonInfo() {
		return this.livraisonInfo;	
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
			tmp.setCommande(this);
			
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
	private void setIdcommande(int myIdcommande) {
		this.idcommande = myIdcommande;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setDateCommande(Date myDateCommande) {
		this.dateCommande = myDateCommande;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setIdEtat(int myIdEtat) {
		this.idEtat = myIdEtat;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setIdClient(int myIdClient) {
		this.idClient = myIdClient;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void setIdLivraisonInfo(int myIdLivraisonInfo) {
		this.idLivraisonInfo = myIdLivraisonInfo;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setClient(Client myClient) {
		this.basicSetClient(myClient);
		myClient.addCommande(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setEtatCommande(EtatCommande myEtatCommande) {
		this.basicSetEtatCommande(myEtatCommande);
		myEtatCommande.addCommande(this);	
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
			newLigneCommande.basicSetCommande(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setLivraisonInfo(LivraisonType myLivraisonInfo) {
		this.basicSetLivraisonInfo(myLivraisonInfo);
		myLivraisonInfo.addCommande(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetIdcommande() {
		this.idcommande = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetDateCommande() {
		this.dateCommande = new Date();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetIdEtat() {
		this.idEtat = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetIdClient() {
		this.idClient = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	private void unsetIdLivraisonInfo() {
		this.idLivraisonInfo = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetClient() {
		if (this.client == null)
			return;
		Client oldclient = this.client;
		this.client = null;
		oldclient.removeCommande(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetEtatCommande() {
		if (this.etatCommande == null)
			return;
		EtatCommande oldetatCommande = this.etatCommande;
		this.etatCommande = null;
		oldetatCommande.removeCommande(this);	
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
			oldLigneCommande.unsetCommande();
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetLivraisonInfo() {
		if (this.livraisonInfo == null)
			return;
		LivraisonType oldlivraisonInfo = this.livraisonInfo;
		this.livraisonInfo = null;
		oldlivraisonInfo.removeCommande(this);	
	}
	
}

