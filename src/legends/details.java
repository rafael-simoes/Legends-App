/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legends;

import java.awt.Image;
import java.awt.Toolkit;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.InputStream;
import javax.swing.ImageIcon;

/**
 *
 * @author Rafael Simões
 */
public class details extends javax.swing.JFrame {

    //private static final String TEST_XML = "/xml/CharacterDetails.xml";
    static String charID = new String();
    
    public static String charDetails;
    /**
     * Creates new form char_details
     */
    public details() {
        
        initComponents();
       

        
        try {

	InputStream inDetails = details.class.getResourceAsStream("/resources/xml/CharacterDetails.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document docDetail = dBuilder.parse(inDetails);
			
	docDetail.getDocumentElement().normalize();

	NodeList nList = docDetail.getElementsByTagName("char");
			
	for (int temp = 0; temp < nList.getLength(); temp++) {

            
		Node nNode = nList.item(temp);
                				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    

			Element eElement = (Element) nNode;
                        
                        if(eElement.getAttribute("id").equals(charID)){

                        nameLabel.setText(eElement.getElementsByTagName("name").item(0).getTextContent()); 
                        hpLabel.setText(eElement.getElementsByTagName("health").item(0).getTextContent());
                        saLabel.setText(eElement.getElementsByTagName("strikeatt").item(0).getTextContent());
                        baLabel.setText(eElement.getElementsByTagName("blastatt").item(0).getTextContent());
                        sdLabel.setText(eElement.getElementsByTagName("strikedef").item(0).getTextContent());
                        bdLabel.setText(eElement.getElementsByTagName("blastdef").item(0).getTextContent());
                        abilityNameLabel.setText(eElement.getElementsByTagName("mainability").item(0).getTextContent());
                        abilityNameLabel.setToolTipText(eElement.getElementsByTagName("maintooltip").item(0).getTextContent());
                        zabilityNameLabel.setText(eElement.getElementsByTagName("zability").item(0).getTextContent());
                        zabilityNameLabel.setToolTipText(eElement.getElementsByTagName("zability").item(0).getTextContent());
                        uniqueLabel.setText(eElement.getElementsByTagName("uniqueability").item(0).getTextContent());
                        uniqueLabel.setToolTipText(eElement.getElementsByTagName("uniquetooltip").item(0).getTextContent());
                        specialNameLabel.setText(eElement.getElementsByTagName("special").item(0).getTextContent());
                        specialNameLabel.setToolTipText(eElement.getElementsByTagName("specialtooltip").item(0).getTextContent());
                        extraNameLabel.setText(eElement.getElementsByTagName("extra").item(0).getTextContent());
                        extraNameLabel.setToolTipText(eElement.getElementsByTagName("extratooltip").item(0).getTextContent());
                        ultimateLabel.setText(eElement.getElementsByTagName("ultimate").item(0).getTextContent());
                        ultimateLabel.setToolTipText(eElement.getElementsByTagName("ultimatetooltip").item(0).getTextContent());
                        tag1Label.setText(eElement.getElementsByTagName("chartag1").item(0).getTextContent());
                        tag2Label.setText(eElement.getElementsByTagName("chartag2").item(0).getTextContent());
                        tag3Label.setText(eElement.getElementsByTagName("chartag3").item(0).getTextContent());
                                               
                        String art1 = eElement.getElementsByTagName("artcard1").item(0).getTextContent();
                        String art2 = eElement.getElementsByTagName("artcard2").item(0).getTextContent();
                        String sprite = eElement.getElementsByTagName("sprite").item(0).getTextContent();
                        String eColor = eElement.getElementsByTagName("color").item(0).getTextContent();
                        
                        
                        ImageIcon charSoul = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/characters/"+sprite)));
                        Image sprite1 = charSoul.getImage();
                        Image sprite2 = sprite1.getScaledInstance(charSprite.getWidth(),charSprite.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon spriteIcon = new ImageIcon(sprite2);
                        charSprite.setIcon(spriteIcon);
                        
                        ImageIcon art = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/"+art1+".png")));
                        Image artImage1 = art.getImage();
                        Image artImage2 = artImage1.getScaledInstance(art1Label.getWidth(),art1Label.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon artIcon1 = new ImageIcon(artImage2);
                        art1Label.setIcon(artIcon1);
                        
                        ImageIcon art_1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/"+art2+".png")));
                        Image artImage1_1 = art_1.getImage();
                        Image artImage2_1 = artImage1_1.getScaledInstance(art2Label.getWidth(),art2Label.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon artIcon1_1 = new ImageIcon(artImage2_1);
                        art2Label.setIcon(artIcon1_1);
                        
                        ImageIcon eleColor = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/elements/"+eColor+".png")));
                        Image Color1 = eleColor.getImage();
                        Image Color2 = Color1.getScaledInstance(colorLabel.getWidth(),colorLabel.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon ColorIcon = new ImageIcon(Color2);
                        colorLabel.setIcon(ColorIcon);
		}  
            }
	}
    } catch (Exception e) {
	
    }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        charImage = new javax.swing.JPanel();
        charSprite = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        charElement = new javax.swing.JLabel();
        charLevel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        abilityNameLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        zabilityNameLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        uniqueLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        hpLabel = new javax.swing.JLabel();
        saLabel = new javax.swing.JLabel();
        baLabel = new javax.swing.JLabel();
        sdLabel = new javax.swing.JLabel();
        bdLabel = new javax.swing.JLabel();
        specialLabel = new javax.swing.JLabel();
        specialNameLabel = new javax.swing.JLabel();
        extraLabel = new javax.swing.JLabel();
        extraNameLabel = new javax.swing.JLabel();
        ultimateSpecialLabel = new javax.swing.JLabel();
        ultimateLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tag1Label = new javax.swing.JLabel();
        tag2Label = new javax.swing.JLabel();
        art1Label = new javax.swing.JLabel();
        art2Label = new javax.swing.JLabel();
        tag3Label = new javax.swing.JLabel();

        setBounds(new java.awt.Rectangle(0, 0, 620, 420));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 620, 420));
        setMaximumSize(new java.awt.Dimension(620, 420));
        setMinimumSize(new java.awt.Dimension(620, 420));
        setPreferredSize(new java.awt.Dimension(620, 420));
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1.setText(charDetails);

        charImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        charImage.setMaximumSize(new java.awt.Dimension(175, 175));
        charImage.setPreferredSize(new java.awt.Dimension(175, 175));

        charSprite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout charImageLayout = new javax.swing.GroupLayout(charImage);
        charImage.setLayout(charImageLayout);
        charImageLayout.setHorizontalGroup(
            charImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(charImageLayout.createSequentialGroup()
                .addComponent(charSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        charImageLayout.setVerticalGroup(
            charImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(charImageLayout.createSequentialGroup()
                .addComponent(charSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        charElement.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        charElement.setText("Element - ");

        charLevel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        charLevel.setText("@Lvl 1000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Health - ");

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nameLabel.setText("Name");
        nameLabel.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Strike Attack - ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Blast Attack -");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Strike Defense - ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Blast Defense - ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Main Ability");

        abilityNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        abilityNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abilityNameLabel.setText("AbilityName");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Z Ability");

        zabilityNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zabilityNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zabilityNameLabel.setText("Zability");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Unique Ability");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        uniqueLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        uniqueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uniqueLabel.setText("Uability");
        uniqueLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        colorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorLabel.setText(" ");
        colorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        hpLabel.setText("jLabel18");

        saLabel.setText("jLabel19");

        baLabel.setText("jLabel20");

        sdLabel.setText("jLabel21");

        bdLabel.setText("jLabel22");

        specialLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        specialLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        specialLabel.setText("Special");

        specialNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        specialNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        specialNameLabel.setText("specialName");

        extraLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        extraLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extraLabel.setText("Extra");

        extraNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extraNameLabel.setText("extraLabel");

        ultimateSpecialLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ultimateSpecialLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ultimateSpecialLabel.setText("Ulimate Special");

        ultimateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ultimateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ultimateLabel.setText("None");
        ultimateLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(charElement)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hpLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(baLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sdLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bdLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(charLevel)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uniqueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zabilityNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(abilityNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(ultimateSpecialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(specialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(extraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(35, 35, 35))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(extraNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ultimateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(specialNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(44, 44, 44))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(charLevel))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(charElement)
                    .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hpLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(saLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(baLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(bdLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(specialLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abilityNameLabel)
                    .addComponent(specialNameLabel))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(extraLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zabilityNameLabel)
                    .addComponent(extraNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(ultimateSpecialLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uniqueLabel)
                    .addComponent(ultimateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Art Cards Held");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Character Tags");
        jLabel3.setToolTipText("");

        tag1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tag1Label.setText("jLabel17");

        tag2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tag2Label.setText("jLabel19");

        art1Label.setText("jLabel17");

        art2Label.setText("jLabel17");

        tag3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tag3Label.setText("jLabel19");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(charImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tag3Label)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(13, 13, 13)
                                                    .addComponent(art1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(art2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel2)))))
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tag1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tag2Label)
                                .addGap(29, 29, 29)))))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(charImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(art1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(art2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tag1Label)
                            .addComponent(tag2Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tag3Label))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        charID = args[0];
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new details().setVisible(true);
                
            }
        });
        
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abilityNameLabel;
    private javax.swing.JLabel art1Label;
    private javax.swing.JLabel art2Label;
    private javax.swing.JLabel baLabel;
    private javax.swing.JLabel bdLabel;
    private javax.swing.JLabel charElement;
    private javax.swing.JPanel charImage;
    private javax.swing.JLabel charLevel;
    private javax.swing.JLabel charSprite;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JLabel extraLabel;
    private javax.swing.JLabel extraNameLabel;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel nameLabel;
    private javax.swing.JLabel saLabel;
    private javax.swing.JLabel sdLabel;
    private javax.swing.JLabel specialLabel;
    private javax.swing.JLabel specialNameLabel;
    private javax.swing.JLabel tag1Label;
    private javax.swing.JLabel tag2Label;
    private javax.swing.JLabel tag3Label;
    private javax.swing.JLabel ultimateLabel;
    private javax.swing.JLabel ultimateSpecialLabel;
    private javax.swing.JLabel uniqueLabel;
    private javax.swing.JLabel zabilityNameLabel;
    // End of variables declaration//GEN-END:variables
}
