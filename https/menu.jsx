import { useState } from "react";

// ── Real Wikimedia Commons images (CC-licensed, freely embeddable) ──────────
const W = "https://upload.wikimedia.org/wikipedia/commons/thumb";
const IMGS = {
  dal:      `${W}/8/8d/Dal-tadka-2.jpg/320px-Dal-tadka-2.jpg`,
  veg:      `${W}/4/4e/Chana_masala.jpg/320px-Chana_masala.jpg`,
  mushroom: `${W}/6/69/Mushroom_masala.jpg/320px-Mushroom_masala.jpg`,
  starter:  `${W}/b/b3/Chilli_potato.jpg/320px-Chilli_potato.jpg`,
  paneer:   `${W}/e/e9/Paneer_butter_masala.jpg/320px-Paneer_butter_masala.jpg`,
  rice:     `${W}/a/a7/Veg_fried_rice.jpg/320px-Veg_fried_rice.jpg`,
  noodles:  `${W}/c/c6/Veg_hakka_noodles.jpg/320px-Veg_hakka_noodles.jpg`,
  bread:    `${W}/f/fd/Aloo_Paratha_and_Raita.jpg/320px-Aloo_Paratha_and_Raita.jpg`,
  thali:    `${W}/e/e7/Indian_veg_thali.jpg/320px-Indian_veg_thali.jpg`,
  sides:    `${W}/4/4d/Boondi_raita.jpg/320px-Boondi_raita.jpg`,
  dosa:     `${W}/9/9a/Dosai_Chutney_Hotel_Saravana_Bhavan.jpg/320px-Dosai_Chutney_Hotel_Saravana_Bhavan.jpg`,
  ravadosa: `${W}/4/42/Rava_dosa.jpg/320px-Rava_dosa.jpg`,
  uttapam:  `${W}/7/71/Onion_uttapam.jpg/320px-Onion_uttapam.jpg`,
  idli:     `${W}/6/6b/Idli_sambar.jpg/320px-Idli_sambar.jpg`,
  combo:    `${W}/e/e5/Haldiram_SouthIndian.JPG/320px-Haldiram_SouthIndian.JPG`,
  lassi:    `${W}/3/3c/Lassi_glass.jpg/320px-Lassi_glass.jpg`,
};

// Fallback gradient colours per section if image fails to load
const FALLBACKS = {
  dal:"#f4a72d",veg:"#e05c1a",mushroom:"#8b5e3c",starter:"#d44f1a",
  paneer:"#f08030",rice:"#c8a43a",noodles:"#a0522d",bread:"#d2691e",
  thali:"#b8732a",sides:"#d4a040",dosa:"#c8872a",ravadosa:"#d4932a",
  uttapam:"#c07820",idli:"#c89030",combo:"#b87828",lassi:"#e8c050",
};

const Logo = () => (
  <svg viewBox="0 0 100 115" width="80" height="92" xmlns="http://www.w3.org/2000/svg">
    <circle cx="50" cy="50" r="46" fill="none" stroke="#C8951A" strokeWidth="2.5"/>
    <circle cx="50" cy="50" r="41" fill="none" stroke="#E5B84A" strokeWidth="0.8" strokeDasharray="4 3"/>
    <circle cx="50" cy="50" r="37" fill="#0B4F3A"/>
    {[0,45,90,135,180,225,270,315].map(r=>(
      <path key={r} d="M50 13 Q55 24 50 31 Q45 24 50 13" fill="#C8951A" opacity="0.85" transform={`rotate(${r} 50 50)`}/>
    ))}
    <circle cx="50" cy="50" r="27" fill="#FFFDF5"/>
    <text x="50" y="62" textAnchor="middle" fontFamily="Georgia,serif" fontSize="31" fontWeight="bold" fill="#0B4F3A">A</text>
    <line x1="32" y1="66" x2="68" y2="66" stroke="#C8951A" strokeWidth="1.5"/>
    <path id="tA" d="M 13 50 A 37 37 0 0 1 87 50" fill="none"/>
    <text fontFamily="Georgia,serif" fontSize="7" fontWeight="bold" fill="#F5E0A0" letterSpacing="2.5"><textPath href="#tA" startOffset="9%">APARNA CAFE</textPath></text>
    <path id="bA" d="M 17 58 A 37 37 0 0 0 83 58" fill="none"/>
    <text fontFamily="Arial,sans-serif" fontSize="6" fill="#E5B84A" letterSpacing="2"><textPath href="#bA" startOffset="13%">✦ PURE VEG ✦</textPath></text>
    <text x="50" y="108" textAnchor="middle" fontSize="9" fill="#C8951A">✦ ✦ ✦</text>
  </svg>
);

// Circular food image thumbnail with colour fallback
const FoodThumb = ({src,fallback,size=30}) => {
  const [err,setErr]=useState(false);
  return err
    ? <div style={{width:size,height:size,borderRadius:"50%",background:fallback||"#c8951a",border:"2px solid #C8951A",flexShrink:0}}/>
    : <img src={src} alt="" onError={()=>setErr(true)}
        style={{width:size,height:size,objectFit:"cover",borderRadius:"50%",border:"2px solid #C8951A",flexShrink:0,background:"#e8dfc0"}}/>;
};

// Section header with real food photo
const SH = ({icon,title,imgKey}) => (
  <div style={{background:"linear-gradient(135deg,#0B4F3A,#0d6349)",color:"#F5E0A0",fontSize:8,fontWeight:700,letterSpacing:.8,textTransform:"uppercase",padding:"3px 6px",borderRadius:"3px 3px 0 0",borderBottom:"2px solid #C8951A",display:"flex",alignItems:"center",gap:5}}>
    {imgKey
      ? <FoodThumb src={IMGS[imgKey]} fallback={FALLBACKS[imgKey]} size={26}/>
      : <span style={{fontSize:12}}>{icon}</span>}
    <span>{title}</span>
  </div>
);

const Row = ({name,sub,price,special}) => (
  <div style={{display:"flex",justifyContent:"space-between",alignItems:"center",padding:"2.5px 7px",borderBottom:"1px dotted #d4c090",fontSize:7.8,background:special?"rgba(200,149,26,0.1)":"transparent"}}>
    <span style={{flex:1,color:"#2D1F0E",fontWeight:special?700:400}}>
      {name}
      {sub&&<span style={{fontSize:6.8,color:"#6B7280",fontStyle:"italic",display:"block"}}>{sub}</span>}
    </span>
    <span style={{color:"#8B1A1A",fontWeight:700,fontSize:special?9:7.8,marginLeft:4,whiteSpace:"nowrap"}}>{price}</span>
  </div>
);

const DalRow = ({name,h,f}) => (
  <div style={{display:"flex",justifyContent:"space-between",alignItems:"center",padding:"2.5px 7px",borderBottom:"1px dotted #d4c090",fontSize:7.8}}>
    <span style={{flex:1,color:"#2D1F0E"}}>{name}</span>
    <span style={{display:"flex",gap:8,fontSize:7}}>
      <span style={{textAlign:"center"}}><span style={{display:"block",fontSize:6.2,color:"#777"}}>HALF</span><span style={{color:"#8B1A1A",fontWeight:700}}>₹{h}</span></span>
      <span style={{textAlign:"center"}}><span style={{display:"block",fontSize:6.2,color:"#777"}}>FULL</span><span style={{color:"#8B1A1A",fontWeight:700}}>₹{f}</span></span>
    </span>
  </div>
);

const Sec = ({icon,title,imgKey,children}) => (
  <div style={{marginBottom:7}}>
    <SH icon={icon} title={title} imgKey={imgKey}/>
    <div style={{border:"1px solid #d4c090",borderTop:"none",borderRadius:"0 0 3px 3px",background:"#FDF6E3"}}>{children}</div>
  </div>
);

// Photo strip below header
const Strip = ({items}) => (
  <div style={{display:"flex",gap:5,justifyContent:"center",padding:"5px 10px",background:"rgba(11,79,58,0.05)",borderBottom:"1px solid #d4c090",marginLeft:68,flexWrap:"wrap"}}>
    {items.map(({k,cap})=>(
      <div key={k} style={{display:"flex",flexDirection:"column",alignItems:"center",gap:2}}>
        <FoodThumb src={IMGS[k]} fallback={FALLBACKS[k]} size={62}/>
        <span style={{fontSize:6,color:"#555",fontStyle:"italic",textAlign:"center",maxWidth:64}}>{cap}</span>
      </div>
    ))}
  </div>
);

const Sidebar = ({page}) => (
  <div style={{position:"absolute",left:0,top:0,bottom:0,width:68,background:"linear-gradient(180deg,#0B4F3A,#083d2c)",borderRight:"2px solid #C8951A",zIndex:1,padding:"5px 4px",overflow:"hidden"}}>
    <div style={{textAlign:"center",marginBottom:3}}><Logo/></div>
    <hr style={{border:"none",borderTop:"1px solid rgba(200,149,26,.4)",margin:"3px 0"}}/>
    {page===1?<>
      <div style={{color:"#C8951A",fontSize:6,fontWeight:700,letterSpacing:1,textTransform:"uppercase",textAlign:"center"}}>AVAILABLE DAILY</div>
      <div style={{color:"#e8dfc0",fontSize:6.5,textAlign:"center",fontWeight:700,textTransform:"uppercase",letterSpacing:.5}}>All Day Dining</div>
      <hr style={{border:"none",borderTop:"1px solid rgba(200,149,26,.4)",margin:"3px 0"}}/>
      <div style={{color:"#C8951A",fontSize:6.5,fontWeight:700,textTransform:"uppercase",textAlign:"center",borderBottom:"1px solid rgba(200,149,26,.4)",paddingBottom:2,marginBottom:3}}>Beverages</div>
      {[["Lassi (Sweet)","40"],["Lassi (Salted)","40"],["Masala Chai","20"],["Cold Drink","30"],["Nimbu Pani","25"]].map(([n,p])=>(
        <div key={n} style={{display:"flex",justifyContent:"space-between",fontSize:6.2,color:"#e8dfc0",padding:"1.5px 1px",borderBottom:"1px dotted rgba(229,184,74,.15)"}}>
          <span>{n}</span><span style={{color:"#C8951A",fontWeight:700}}>₹{p}</span>
        </div>
      ))}
    </>:<>
      <div style={{color:"#C8951A",fontSize:6.5,fontWeight:700,letterSpacing:1,textTransform:"uppercase",textAlign:"center"}}>SOUTH INDIAN</div>
      <div style={{color:"#e8dfc0",fontSize:6.5,textAlign:"center",fontWeight:700}}>Special Menu</div>
      <hr style={{border:"none",borderTop:"1px solid rgba(200,149,26,.4)",margin:"4px 0"}}/>
      <div style={{textAlign:"center"}}>
        <FoodThumb src={IMGS.dosa} fallback={FALLBACKS.dosa} size={54}/>
      </div>
      <hr style={{border:"none",borderTop:"1px solid rgba(200,149,26,.4)",margin:"4px 0"}}/>
      <div style={{color:"#d4c090",fontSize:6,lineHeight:1.5,textAlign:"center"}}>
        FRESHLY MADE<br/><span style={{fontStyle:"italic",color:"#e8dfc0"}}>Crispy golden dosas<br/>with sambar &amp; chutney</span>
      </div>
    </>}
    <hr style={{border:"none",borderTop:"1px solid rgba(200,149,26,.4)",margin:"3px 0"}}/>
    <div style={{color:"#F5E0A0",fontSize:5.8,textAlign:"center",lineHeight:1.5}}>Prices inclusive of taxes</div>
    <hr style={{border:"none",borderTop:"1px solid rgba(200,149,26,.4)",margin:"3px 0"}}/>
    <div style={{color:"#F5E0A0",fontSize:5.8,textAlign:"center"}}>✦ Pure Veg Only ✦</div>
  </div>
);

const Header = ({t}) => (
  <div style={{background:"linear-gradient(135deg,#0B4F3A,#0d6349)",padding:"7px 20px",borderBottom:"3px solid #C8951A",textAlign:"center"}}>
    <div style={{color:"#F5E0A0",fontSize:9,letterSpacing:2,textTransform:"uppercase",fontStyle:"italic"}}>{t}</div>
  </div>
);
const Footer = () => (
  <div style={{background:"linear-gradient(135deg,#0B4F3A,#0d6349)",padding:"5px 20px",textAlign:"center",borderTop:"3px solid #C8951A"}}>
    <div style={{color:"#F5E0A0",fontSize:7.5,letterSpacing:1.5}}>✦ Aparna Cafe · Pure Vegetarian · All Day Dining ✦ &nbsp;&nbsp; All prices inclusive of taxes &nbsp;&nbsp; Subject to change without notice</div>
  </div>
);
const VegBadge = () => (
  <div style={{textAlign:"center",marginTop:5}}>
    <span style={{display:"inline-block",border:"1.5px solid #22a843",borderRadius:2,padding:"1px 4px",fontSize:6.5,color:"#22a843",fontWeight:700}}>✓ PURE VEG</span>
  </div>
);

export default function Menu() {
  const [page,setPage]=useState(1);
  const page1strips=[{k:"paneer",cap:"Paneer Butter Masala"},{k:"veg",cap:"Chana Masala"},{k:"dal",cap:"Dal Tadka"},{k:"mushroom",cap:"Mushroom Masala"},{k:"thali",cap:"Special Thali"},{k:"rice",cap:"Veg Fried Rice"},{k:"starter",cap:"Chilli Potato"},{k:"bread",cap:"Paratha"}];
  const page2strips=[{k:"dosa",cap:"Masala Dosa"},{k:"ravadosa",cap:"Rava Dosa"},{k:"uttapam",cap:"Uttapam"},{k:"idli",cap:"Idli Sambar"},{k:"combo",cap:"South Indian Platter"}];
  const page={width:"100%",background:"#FFFDF5",position:"relative",border:"3px solid #C8951A",boxShadow:"0 8px 40px rgba(0,0,0,.2)",overflow:"hidden"};
  const grid={marginLeft:68,padding:"6px 8px",display:"grid",gridTemplateColumns:"1fr 1fr 1fr",gap:7,background:"#FFFDF5"};

  return (
    <div style={{background:"#d6cfc0",padding:14,fontFamily:"Arial,sans-serif",minHeight:"100vh"}}>
      {/* Controls */}
      <div style={{display:"flex",justifyContent:"center",gap:10,marginBottom:12}}>
        {[1,2].map(p=>(
          <button key={p} onClick={()=>setPage(p)}
            style={{padding:"6px 18px",background:page===p?"#0B4F3A":"#e8dfc0",color:page===p?"#F5E0A0":"#2D1F0E",border:"2px solid #C8951A",borderRadius:4,fontWeight:700,fontSize:13,cursor:"pointer"}}>
            {p===1?"🍛 Main Menu":"🥞 South Indian Menu"}
          </button>
        ))}
        <button onClick={()=>window.print()}
          style={{padding:"6px 18px",background:"#C8951A",color:"#fff",border:"none",borderRadius:4,fontWeight:700,fontSize:13,cursor:"pointer"}}>
          🖨️ Print / Save PDF
        </button>
      </div>

      {/* PAGE 1 */}
      {page===1&&<div style={page}>
        <Header t="✦ Pure Vegetarian · Fresh & Homestyle Cooking · Multi-Cuisine ✦"/>
        <Sidebar page={1}/>
        <Strip items={page1strips}/>
        <div style={grid}>
          {/* COL 1 */}
          <div>
            <Sec icon="🍲" title="Lentils — Dal" imgKey="dal">
              <DalRow name="Yellow Dal" h={50} f={90}/>
              <DalRow name="Yellow Dal Tadka" h={60} f={100}/>
            </Sec>
            <Sec icon="🥔" title="Main Course — Vegetables" imgKey="veg">
              <Row name="Jeera Aloo" price="₹80"/><Row name="Aloo Matar" price="₹90"/>
              <Row name="Aloo Gobhi" price="₹90"/><Row name="Chana Masala" price="₹100"/>
              <Row name="Rajma Masala" price="₹100"/><Row name="Mix Veg" price="₹120"/>
            </Sec>
            <Sec icon="🍄" title="Mushroom Specialties" imgKey="mushroom">
              <Row name="Matar Mushroom" price="₹140"/><Row name="Mushroom Masala" price="₹130"/>
              <Row name="Mushroom Kadhai" price="₹140"/><Row name="Mushroom Do Pyaza" price="₹130"/>
            </Sec>
            <Sec icon="🌶️" title="Starters & Indo-Chinese" imgKey="starter">
              <Row name="Chilli Potato" price="₹80"/><Row name="Honey Chilli Potato" price="₹100"/>
              <Row name="Mushroom Chilli" price="₹110"/><Row name="Paneer Chilli" price="₹120"/>
              <Row name="Veg Manchurian" price="₹100"/><Row name="Momos" price="₹20"/>
            </Sec>
          </div>
          {/* COL 2 */}
          <div>
            <Sec icon="🧀" title="Paneer Specialties" imgKey="paneer">
              <Row name="Paneer Masala" price="₹140"/><Row name="Kadhai Paneer" price="₹160"/>
              <Row name="Paneer Do Pyaza" price="₹150"/><Row name="Paneer Mushroom Masala" price="₹180"/>
              <Row name="Paneer Butter Masala" price="₹160"/><Row name="Paneer Bhurji" price="₹200"/>
              <Row name="Kaju Paneer Masala" price="₹220"/>
            </Sec>
            <Sec icon="🍚" title="Rice" imgKey="rice">
              <Row name="Rice / Steam Rice" price="₹50"/><Row name="Jeera Rice" price="₹60"/>
              <Row name="Ghee Rice" price="₹70"/><Row name="Veg Fried Rice" price="₹80"/>
              <Row name="Schezwan Fried Rice" price="₹90"/><Row name="Paneer Fried Rice" price="₹110"/>
              <Row name="Mushroom Fried Rice" price="₹110"/>
            </Sec>
            <Sec icon="🍜" title="Noodles" imgKey="noodles">
              <Row name="Veg Noodles" price="₹80"/><Row name="Schezwan Noodles" price="₹80"/>
              <Row name="Paneer Noodles" price="₹180"/><Row name="Mushroom Noodles" price="₹110"/>
            </Sec>
            <Sec icon="🫓" title="Snacks & Breads" imgKey="bread">
              <Row name="Poori Sabji" price="₹40"/><Row name="Chhola Bhatura" price="₹40"/>
              <Row name="Tawa Roti" price="₹8"/><Row name="Butter Roti" price="₹10"/>
              <Row name="Paratha / Gobhi Paratha" price="₹50"/><Row name="Paneer Paratha" price="₹60"/>
            </Sec>
          </div>
          {/* COL 3 */}
          <div>
            <Sec icon="🍱" title="Thali & Combos" imgKey="thali">
              <Row name="Chhola Chawal" sub="Chickpea curry with steamed rice" price="₹60"/>
              <Row name="Rajma Chawal" sub="Red kidney beans with steamed rice" price="₹60"/>
              <Row name="Thali 1" sub="Dal · 2 Sabji · Roti · Rice" price="₹80"/>
              <Row name="Thali 2" sub="Dal · 2 Sabji · Paneer · Roti · Rice · Papad · Salad" price="₹120"/>
              <Row name="Bati Chokha Thali" sub="Bati · Chokha · Dal · Accompaniments" price="₹130"/>
              <Row name="Special Thali" sub="Chef's complete curated meal" price="₹200" special/>
            </Sec>
            <Sec icon="🥣" title="Sides & Accompaniments" imgKey="sides">
              <Row name="Papad (Dry/Fry)" price="₹10"/><Row name="Plain Dahi" price="₹50"/>
              <Row name="Boondi Raita" price="₹70"/><Row name="Veg Raita" price="₹80"/>
              <Row name="Dahi Vada" price="₹20"/><Row name="Bati Chokha" price="₹30"/>
            </Sec>
            <Sec icon="🥞" title="South Indian (Basic)" imgKey="dosa">
              <Row name="Plain Dosa" price="₹50"/><Row name="Masala Dosa" price="₹60"/>
              <Row name="Paneer Masala Dosa" price="₹80"/>
            </Sec>
            <VegBadge/>
          </div>
        </div>
        <Footer/>
      </div>}

      {/* PAGE 2 */}
      {page===2&&<div style={page}>
        <Header t="✦ South Indian Special Menu · Aparna Cafe ✦"/>
        <Sidebar page={2}/>
        <Strip items={page2strips}/>
        <div style={grid}>
          {/* COL 1 */}
          <div>
            <Sec icon="🥞" title="Plain Dosas" imgKey="dosa">
              <Row name="Plain Dosa" price="₹50"/><Row name="Masala Dosa" price="₹60"/>
              <Row name="Onion Plain Dosa" price="₹80"/><Row name="Onion Masala Dosa" price="₹90"/>
              <Row name="Ghee Roast Dosa" price="₹100"/><Row name="Butter Masala Dosa" price="₹110"/>
              <Row name="Paper Plain Dosa" price="₹100"/><Row name="Paper Masala Dosa" price="₹110"/>
              <Row name="Mysore Masala Dosa" price="₹120"/>
              <Row name="Spl. Narus Dosa" price="₹150" special/>
            </Sec>
            <Sec icon="🫓" title="Rava Dosas" imgKey="ravadosa">
              <Row name="Rava Plain Dosa" price="₹90"/><Row name="Rava Masala Dosa" price="₹110"/>
              <Row name="Onion Rava Plain Dosa" price="₹100"/><Row name="Onion Rava Masala Dosa" price="₹120"/>
              <Row name="Paneer Rava Dosa" price="₹140"/>
            </Sec>
          </div>
          {/* COL 2 */}
          <div>
            <Sec icon="🧀" title="Paneer Dosas" imgKey="paneer">
              <Row name="Paneer Dosa" price="₹120"/><Row name="Paneer Masala Dosa" price="₹130"/>
              <Row name="Paneer Rava Dosa" price="₹140"/>
            </Sec>
            <Sec icon="🍳" title="Uttapam" imgKey="uttapam">
              <Row name="Plain Uttapam" price="₹80"/><Row name="Onion Uttapam" price="₹90"/>
              <Row name="Tomato Uttapam" price="₹90"/><Row name="Mix Veg Uttapam" price="₹100"/>
              <Row name="Onion Tomato Uttapam" price="₹100"/>
            </Sec>
            <Sec icon="🍽️" title="Idli & Rice" imgKey="idli">
              <Row name="Idli Sambhar (2 pcs)" price="₹70"/>
              <Row name="Ghee Idli" price="₹90"/>
              <Row name="South Indian Platter" price="₹180"/>
            </Sec>
            <Sec icon="🥥" title="South Indian Sides">
              <Row name="Extra Butter" price="₹10"/>
              <Row name="Extra Sambar" price="₹20"/>
              <Row name="Extra Chutney" price="₹15"/>
            </Sec>
          </div>
          {/* COL 3 */}
          <div>
            <Sec icon="🎁" title="South Indian Combos" imgKey="combo">
              <Row name="Idli + Dosa Combo" sub="Idli (2) + Plain Dosa + Sambar + Chutney" price="₹120"/>
              <Row name="Dosa Platter" sub="Masala + Uttapam + Rava Dosa + Sambar" price="₹180"/>
              <Row name="South Indian Platter" sub="Idli + Masala Dosa + Uttapam + Sambar" price="₹220" special/>
              <Row name="Mini SI Combo" sub="Idli (2) + Sambar + 2 Chutneys" price="₹90"/>
            </Sec>
            <div style={{marginTop:10}}>
              <SH icon="📞" title="Contact Us"/>
              <div style={{border:"1px solid #d4c090",borderTop:"none",borderRadius:"0 0 3px 3px",background:"linear-gradient(135deg,#fffdf5,#fdf6e3)",padding:"8px 10px"}}>
                <div style={{fontSize:8.5,color:"#0B4F3A",fontWeight:700,marginBottom:3}}>📱 +91 7379393297</div>
                <div style={{fontSize:8.5,color:"#0B4F3A",fontWeight:700,marginBottom:6}}>📱 +91 6393709825</div>
                <div style={{fontSize:7.5,color:"#444",lineHeight:1.6}}>📍 Near Hanuman Mandir,<br/>Panchkoshi Parikarma Marg,<br/>Ranopali, Ayodhya</div>
              </div>
            </div>
            <VegBadge/>
          </div>
        </div>
        <Footer/>
      </div>}
    </div>
  );
}