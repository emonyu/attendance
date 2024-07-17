import React from 'react';
import logo from './logo.svg';
import './App.css';
import './index.css';
type FeeClassification = {
  name1: string;
  time1: string;
  name2: string;
  time2: string;
}
type AdmissionFeeCalculatorState = {
  feeClassifications: FeeClassification[];
}

class Header extends React.Component<{}, FeeClassification> {
  constructor(props: {}) {
    super(props);
    const startWorkingHours = "始業時間";
    const endWorkingHours = "終業時間";
    const opeartionTime: FeeClassification = {
      name1: "稼働上限",
      time1: "",
      name2: "稼働下限",
      time2: ""
    };
    const totalOperationTime: FeeClassification = {
      name1: "稼働合計",
      time1: "",
      name2: "",
      time2: ""
    };
    const remainingOperationTime: FeeClassification = {
      name1: "上限まで",
      time1: "",
      name2: "下限まで",
      time2: ""
    };
    const holiday: FeeClassification = {
      name1: "最低休暇",
      time1: "",
      name2: "最大休暇",
      time2: ""
    }
  }
  render() {
    return (
      <div>
        <div>
          <p>
            稼働上限
          </p>
          <input type="text"></input>
          <p></p>
          <p>
            稼働下限
          </p>
          <input type="text"></input>
        </div>
        <div>
          <p>
            始業時間
          </p>
          <input type="time"></input>
          <p></p>
          <p>
            終業時間
          </p>
          <input type="time"></input>
        </div>
        <div>
          <p>
            稼働合計
          </p>
          <p></p>
          </div>
        <div>
          <p>
            上限まで
          </p>
          <p></p>
          <p></p>
          <p>
            下限まで
          </p>
          <p></p>
          </div>
        <div>
          <p>
            最低休暇
          </p>
          <p></p>
          <p></p>
          <p>
            最大休暇
          </p>
          <p></p>
        </div>
      </div>
    );
  }
}

// type DetailProps = {
//   classification: FeeClassification;
//   onNumOfPeopleChange: (num: number) => void;
// }

// const Detail: React.FC<DetailProps> = props => {
//   const onNumOfPeopleChange = (e: React.ChangeEvent<HTMLSelectElement>) => {
//     const num: number = Number(e.target.value);
//     props.onNumOfPeopleChange(num);
//   }

//   return (
//     <div >
//       <div className="classification-name">{props.classification.name}</div>
//       <div className="description">{props.classification.description}</div>
//       <div className="unit-price">{props.classification.unitPrice}円</div>
//       <div className="num-people">
//         <select value={props.classification.numOfPeople} onChange={e => onNumOfPeopleChange(e)}>
//           <option value="0">0</option>
//           <option value="1">1</option>
//           <option value="2">2</option>
//           <option value="3">3</option>
//           <option value="4">4</option>
//         </select>
//         <span>名</span>
//       </div>
//     </div>
//   );
// }

// type SummaryProps = {
//   numOfPeople: number;
//   totalAmount: number;
// }

// const Summary: React.FC<SummaryProps> = props => {
//   return (
//     <div>
//       <div className="party">
//         <input type="text" className="party" value={props.numOfPeople} />
//         <span>名様</span>
//       </div>
//       <div className="total-amount">
//         <span>合計</span>
//         <input type="text" className="total-amount" value={props.totalAmount} />
//         <span>円</span>
//       </div>
//     </div>
//   );
// }

class AdmissionFeeCalculator extends React.Component<{}, AdmissionFeeCalculatorState> {

  constructor(props: {}) {
    super(props);
    const workingHours: FeeClassification = {
      name1: "始業時間",
      time1: "",
      name2: "終業時間",
      time2: ""
    };
    const opeartionTime: FeeClassification = {
      name1: "稼働上限",
      time1: "",
      name2: "稼働下限",
      time2: ""
    };
    const totalOperationTime: FeeClassification = {
      name1: "稼働合計",
      time1: "",
      name2: "",
      time2: ""
    };
    const remainingOperationTime: FeeClassification = {
      name1: "上限まで",
      time1: "",
      name2: "下限まで",
      time2: ""
    };
    const holiday: FeeClassification = {
      name1: "最低休暇",
      time1: "",
      name2: "最大休暇",
      time2: ""
    }
    this.state = { feeClassifications: [workingHours, opeartionTime, totalOperationTime, remainingOperationTime, holiday] };
  }

  // handleNumOfPeopleChange(idx: number, num: number) {
  //   const currentFC = this.state.feeClassifications[idx];
  //   const newTotalPrice = currentFC.unitPrice * num;
  //   // 人数と合計額以外は既存の値をコピー
  //   const newFC: FeeClassification =
  //     Object.assign({}, currentFC, { numOfPeople: num, totalPrice: newTotalPrice });
  //   // 新たな配列を生成
  //   const feeClassifications = this.state.feeClassifications.slice();
  //   feeClassifications[idx] = newFC;

  //   // stateの更新
  //   this.setState({ feeClassifications: feeClassifications });
  // }

  render() {
    const heads = Header;

    // const details = this.state.feeClassifications.map((fc, idx) => {
    //   return (
    //     <Detail key={idx.toString()} classification={fc}
    //       onNumOfPeopleChange={n => this.handleNumOfPeopleChange(idx, n)} />
    //   );
    // });
    // const numOfPeople = this.state.feeClassifications.map(fc => fc.numOfPeople).reduce((p, c) => p + c);
    // const totalAmount = this.state.feeClassifications.map(fc => fc.totalPrice).reduce((p, c) => p + c);

    // return (
    //   <>
    //     {details}
    //     <Summary numOfPeople={numOfPeople} totalAmount={totalAmount} />
    //   </>
    // );
    return (<Header />);
  }
}

const App: React.FC = () => {
  return (
    <div className="main">
      <Header />
    </div>
  );
}

export default App;
